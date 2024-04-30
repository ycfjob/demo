#Demo

# History

創建時間 : 2024/4/30


# 目的

CI/CD (Docker/K8S) 測試使用


# 說明

step 1 : 打包
$ mvn clean package 

順便調整 docker image 內 jar 的版本資訊 (????)


step 2 : 切到有 Dockerfile 的目錄


step 3 :  創建 docker image
 創建
 
 $ docker build -t demo .
 
 查看
 
 $ docker images 
 
step 4 : 跑 container  (預設是 dev)

$ docker run --name demo -p 9000:9000 demo


# Docker image 部署

(如果是第一次)

step 1 : 壓 tag
$ docker tag {image name} {DockerHub帳號}/{image name} 

step 2 : 登入 docker hub 

$ docker login 

step 3 :  docker push 對應 image

$ docker push {DockerHub帳號}/{image name} 



 
# 環境資訊
 



| 種類 | 類別 | 版本 | 備註|
| :------| --------------: | :---------: |:-----------------------: |
| 基底.     | JDK                     | 8               | JDK    |
| 基底 | Spring        |         |                         |
| 基底 | Spring Boot  | 2.7   |                         |

