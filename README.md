# 
-
<p align="center"><img width="700" src=""></p>

## 1. 프로젝트 소개
### [기획배경]

</br>

## 🕰️ 프로젝트 기간
2024-01-11 ~ 2024-02-08
<br>

## 2. 프로젝트 구조
```
   src
    ├── main
    │   ├── generated
    │   ├── java
    │   │   └── com
    │   │       └── std
    │   │           └── sbb
    │   │               ├── domain
    │   │               │   ├── answer
    │   │               │   │   ├── controller
    │   │               │   │   ├── entity
    │   │               │   │   ├── form
    │   │               │   │   ├── repository
    │   │               │   │   └── service
    │   │               │   ├── email
    │   │               │   │   ├── controller
    │   │               │   │   └── service
    │   │               │   ├── member
    │   │               │   │   ├── controller
    │   │               │   │   ├── entity
    │   │               │   │   ├── form
    │   │               │   │   ├── repository
    │   │               │   │   └── service
    │   │               │   ├── question
    │   │               │   │   ├── controller
    │   │               │   │   ├── entity
    │   │               │   │   ├── form
    │   │               │   │   ├── repository
    │   │               │   │   └── service
    │   │               │   ├── review
    │   │               │   │   ├── controller
    │   │               │   │   ├── entity
    │   │               │   │   ├── form
    │   │               │   │   ├── repository
    │   │               │   │   └── service
    │   │               │   ├── taste
    │   │               │   │   ├── entity
    │   │               │   │   ├── form
    │   │               │   │   ├── repository
    │   │               │   │   └── service
    │   │               │   └── wine
    │   │               │       ├── controller
    │   │               │       ├── entity
    │   │               │       ├── form
    │   │               │       ├── repository
    │   │               │       ├── searchType
    │   │               │       └── service
    │   │               └── global
    │   │                   ├── imagesfile
    │   │                   │   ├── config
    │   │                   │   ├── controller
    │   │                   │   ├── entity
    │   │                   │   ├── repository
    │   │                   │   └── service
    │   │                   ├── initDate
    │   │                   ├── jpa
    │   │                   ├── rq
    │   │                   ├── security
    │   │                   └── standard
    │   │                       └── utill
    │   └── resources
    │       ├── static
    │       │   └── images
    │       └── templates
    └── test
        └── java
            └── com
                └── std
                    └── sbb

```
## 3. 개발환경
<div align="center">
<p style="font-size:20px;">💻 Tech Stack 💻</p>
<img src="https://img.shields.io/badge/HTML5-E34F26?style=flat&logo=HTML5&logoColor=white"/>
<img src="https://img.shields.io/badge/Tailwindcss-06B6D4?style=flat&logo=Tailwindcss&logoColor=white"/>
<img src="https://img.shields.io/badge/JavaScript-f7df1e?style=flat&logo=JavaScript&logoColor=white"/>
<img src="https://img.shields.io/badge/Java-007396?style=flat&logo=Java&logoColor=white"/>
<img src="https://img.shields.io/badge/JSON-000000?style=flat-square&logo=json&logoColor=white"/>
<img src="https://img.shields.io/badge/Svelte-FF3E00?style=flat-square&logo=Svelte&logoColor=white"/>
<br/>
<img src="https://img.shields.io/badge/mariadb-003545?style=flat&logo=mariadb&logoColor=white"/>
<img src="https://img.shields.io/badge/MySQL-4479a1?style=flat&logo=mysql&logoColor=white"/> 
<img src="https://img.shields.io/badge/Springboot-6DB33F?style=flat&logo=Springboot&logoColor=white"/>
<img src="https://img.shields.io/badge/Postman-FF6C37?style=flat-square&logo=Postman&logoColor=white"/>
<br/>
<br/>
  
<p style="font-size:20px;">🛠 Tools 🛠</p>
<img src="https://img.shields.io/badge/GitHub-181717?style=flat&logo=GitHub&181717=white"/>
<img src="https://img.shields.io/badge/intellijidea-000000?style=flat&logo=intellijidea&logoColor=white">
<img src="https://img.shields.io/badge/dbeaver-382923?style=flat&logo=dbeaver&logoColor=white">
</div>

## 4. ERD 설계

## 5. 시연 영상

## 6. 트러블 슈팅
<details>
<br/>
   
1. 문제 : JWT 토큰 검증을 구현하면서 axios를 이용하는 도중에 localstorege가 정의되지 않는다는 오류가 계속 발생하였다.
2. 원인 : localStorage는 브라우저에서 제공하는 Web Storage API의 일부이며, 서버 쪽에서는 실행 될 수 없는 이유때문이였다. localStorage를 사용하는 코드를 브라우저 환경에서만 실행되도록 분기 처리하였다.
3. 해결 :  if (typeof window !== 'undefined’)이 구문을 통하여 현재 브라우저 및 클라이언트에서 실행되는지 확인해달라는 구문이다. 브라우저에서는 window라는 객체가 존재하지 않는데,  만약 브라우저가 아닌 곳에서 실행하면 undefined구문이 반환된다.
￼
<img width="571" alt="스크린샷 2024-02-06 오후 8 23 41" src="https://github.com/helloCar-2/helloCar/assets/139303810/48ade988-8f8e-47eb-80e6-a9e70ae7be87">

</details>

<details>
  
<br/>
</details>

<details>
   </br>
   
</details>
