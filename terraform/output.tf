output "cluster_arn" {
  value = aws_ecs_cluster.taskflow_pro.arn
}

output "service_name" {
  value = aws_ecs_service.taskflow_pro.name
}
