provider "aws" {
  region = var.region
}

resource "aws_ecs_cluster" "taskflow_pro" {
  name = "taskflow-pro-cluster"
}

resource "aws_ecs_task_definition" "taskflow_pro" {
  family                = "taskflow-pro-task-family"
  network_mode          = "awsvpc"
  requires_compatibilities = ["FARGATE"]
  cpu                   = "256"
  memory                = "512"

  container_definitions = jsonencode([
    {
      name      = "taskflow-pro-container"
      image     = var.ecs_image
      essential = true
    }
  ])
}

resource "aws_ecs_service" "taskflow_pro" {
  name            = "taskflow-pro-service"
  cluster         = aws_ecs_cluster.taskflow_pro.id
  task_definition = aws_ecs_task_definition.taskflow_pro.arn
  desired_count   = var.desired_count
}
