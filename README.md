#Demo

# History

創建時間 : 2024/4/30


# 目的

CI/CD (Docker/K8S) 測試使用


# 說明

step 1 : 切到有 Dockerfile 的目錄


step 2 :  創建 docker image
 創建
 
 $ docker build -t demo .
 
 查看
 
 $ docker images 
 
step 3 : 跑 container 

$ docker run --name demo -p 9000:9000 demo
 
# 環境資訊
 



| 種類 | 類別 | 版本 | 備註|
| :------| --------------: | :---------: |:-----------------------: |
| 基底.     | JDK                     | 8               | JDK    |
| 基底 | Spring        |         |                         |
| 基底 | Spring Boot.  | 2.7   |                         |

