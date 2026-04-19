#!/bin/bash

docker build -t taskflowpro .
docker tag taskflowpro:latest $AWS_ACCOUNT_ID.dkr.ecr.$AWS_DEFAULT_REGION.amazonaws.com/taskflowpro:latest
docker push $AWS_ACCOUNT_ID.dkr.ecr.$AWS_DEFAULT_REGION.amazonaws.com/taskflowpro:latest

terraform init
terraform plan -var="ecs_image=$AWS_ACCOUNT_ID.dkr.ecr.$AWS_DEFAULT_REGION.amazonaws.com/taskflowpro:latest"
terraform apply -auto-approve