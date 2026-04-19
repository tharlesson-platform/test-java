package com.taskflowpro.api.service;

import com.taskflowpro.api.dto.OrganizationDto;
import com.taskflowpro.api.entity.Organization;
import com.taskflowpro.api.mapper.OrganizationMapper;
import com.taskflowpro.api.repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrganizationService {

    @Autowired
    private OrganizationRepository organizationRepository;

    @Autowired
    private OrganizationMapper organizationMapper;

    public OrganizationDto createOrganization(OrganizationDto organizationDto) {
        Organization organization = organizationMapper.toEntity(organizationDto);
        return organizationMapper.toDto(organizationRepository.save(organization));
    }

    public List<OrganizationDto> getAllOrganizations() {
        List<Organization> organizations = organizationRepository.findAll();
        return organizationMapper.toDtoList(organizations);
    }

    public OrganizationDto getOrganizationById(Long id) {
        Optional<Organization> organizationOptional = organizationRepository.findById(id);
        if (organizationOptional.isPresent()) {
            return organizationMapper.toDto(organizationOptional.get());
        } else {
            throw new RuntimeException("Organization not found");
        }
    }

    public OrganizationDto updateOrganization(Long id, OrganizationDto organizationDto) {
        Optional<Organization> organizationOptional = organizationRepository.findById(id);
        if (organizationOptional.isPresent()) {
            Organization organization = organizationMapper.toEntity(organizationDto);
            organization.setId(id);
            return organizationMapper.toDto(organizationRepository.save(organization));
        } else {
            throw new RuntimeException("Organization not found");
        }
    }

    public void deleteOrganization(Long id) {
        Optional<Organization> organizationOptional = organizationRepository.findById(id);
        if (organizationOptional.isPresent()) {
            organizationRepository.delete(organizationOptional.get());
        } else {
            throw new RuntimeException("Organization not found");
        }
    }
}