variable "region" {
  description = "The AWS region to deploy resources"
  type        = string
}

variable "ecs_image" {
  description = "Docker image for the ECS task"
  type        = string
}

variable "desired_count" {
  description = "Number of desired tasks in the ECS service"
  type        = number
}