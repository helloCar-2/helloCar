# 
- 차에 대해 흥미가 있고, 시승을 해보고 싶은 사람들을 위한 앱입니다.
<p align="center"><img width="700" src="https://github.com/helloCar-2/helloCar/assets/139303810/7d3aaecb-5393-4c12-9c81-950f2c9c7a6f"></p>



## 1. 프로젝트 소개
### [기획배경]
어떤차가 출시 되었고 차의 옵션의 선택지가 무엇이 있는지 잘 모르는 사용자가 간편하게 검색해 차의 대한 정보를 얻고, 직접 시승 체험과 연결지어 사용자 조건에 맞는 자동차를 찾을 수 있게 해주면 어떨까? 라는 생각이 들어 프로젝트를 기획하게 되었습니다.
</br>

## 🕰️ 프로젝트 기간
2024-01-11 ~ 2024-02-08
<br>

## 2. 프로젝트 구조
```
   frontapp
    ├── src
    │   ├── lib
    │   │   ├── axiosEnterceptor
    │   │   ├── requestToken
    │   │   └── responseToken
    │   └── routes
    │   │   ├── auth
    │   │   ├── car-detail
    │   │   ├── car-home
    │   │   ├── car-list
    │   │   ├── car-start
    │   │   ├── car-testdrive
    │   │   ├── chat-qna
    │   │   ├── footer
    │   │   ├── hellocar
    │   │   ├── login-search
    │   │   ├── model-search
    │   │   ├── my-page
    │   │   ├── oauth
    │   │   ├── password-search
    │   │   ├── signup-form
    │   │   ├── testdrive-list
    │   │   └── wish-list
    └── static
          └── img
   src
    ├── main
    │   ├── generated
    │   ├── java
    │   │   └── com
    │   │       └── example
    │   │           └── hellocar
    │   │               ├── domain
    │   │               │   ├── hellocar
    │   │               │   │   ├── controller
    │   │               │   │   ├── entity
    │   │               │   │   ├── repository
    │   │               │   │   └── service
    │   │               │   ├── member
    │   │               │   │   ├── controller
    │   │               │   │   ├── entity
    │   │               │   │   ├── repository
    │   │               │   │   └── service
    │   │               │   ├── qna
    │   │               │   │   ├── controller
    │   │               │   │   ├── entity
    │   │               │   │   ├── repository
    │   │               │   │   └── service
    │   │               │   ├── testdrive
    │   │               │   │   ├── controller
    │   │               │   │   ├── entity
    │   │               │   │   ├── form
    │   │               │   │   ├── repository
    │   │               │   │   └── service
    │   │               ├── global
    │   │               │    ├── baseentity
    │   │               │    ├── config
    │   │               │    ├── filter
    │   │               │    ├── initdata
    │   │               │    ├── jwt
    │   │               │    ├── mvcconfig
    │   │               │    ├── rq
    │   │               │    ├── rs
    │   │               │    ├── tokenverify
    │   │               │    └── utill
    │   │               └── board
    │   │                   ├── controller
    │   │                   ├── entity
    │   │                   ├── repository
    │   │                   └── service
    │   └── resources
    │       ├── static
    │       │   └── img
    │       └── templates
    └── test
        └── java
            └── com
                └── example
                    └── hellocar

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

<p align="center"><img width="900" src="https://github.com/winesProject/wines/assets/133175842/34e4b2cd-c5a7-4591-9a34-5d633dfe5956"></p>


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
   
1. 문제 : 소셜 로그인을 진행했는데 인증 처리가 되지 않아, 홈페이지 접속이 되지 않는 문제가 발생했다
2. 원인 : 기존 스프링부트, 스프링 시큐리티로 구현한 소셜로그인은 쿠키값을 이용해서 인증처리를 했었는데 우리 홈페이지는 로컬스토리지를 이용한 토큰으로 로그인한 유저를 검증을 하는게 문제였다
3. 해결 : 카카오 로그인을 진행하면 카카오 서버에서 코드를 발급하는데 이것을 이용해서 다시 카카오 서버로 토큰 요청을 보내면 Access토큰과 Refresh토큰을 발급한다.

발급받은 Access토큰을 access_token이라는 변수에 저장하고, Access 토큰을 이용해 다시 카카오 서버로 유저 정보 요청을 보내면 카카오 서버에서 확인한 후, 해당 유저의 정보를 알려주었는데, 해당 유저의 정보를 우리 백엔드 서버로 보내, 데이터베이스에 해당 회원이 있으면 그 회원을 바탕으로 Access, Refresh 토큰을 발급해서 프론트엔드로 넘겨주어 로컬 스토리지에 저장시키고,

데이터베이스에 해당 회원이 없으면 회원가입을 진행하고, Access, Refresh 토큰을 발급해서 프론트엔드로 넘겨주어 로컬 스토리지에 저장시켰다

![image](https://github.com/helloCar-2/helloCar/assets/144636282/7696277d-e7cb-451b-90cc-903aab896cc6)
![image](https://github.com/helloCar-2/helloCar/assets/144636282/ba3859c1-ba56-4472-8108-1fab90f0969c)

</details>

<details>
   </br>

1. 문제 : 회원탈퇴 시, DB에 저장된 자동차 데이터도 같이 삭제되었다
2. 원인 : 이 문제의 원인은 찜 리스트 테이블을 별도로 관리하지 않아서, cascade = CascadeType.REMOVE를 사용 할 경우, 유저의 Set타입으로 설정된 차량리스트 안의 차의 데이터가 같이 삭제되는 것이었다
3. 해결 : HardDelete가 아닌 SoftDelete를 이용해서 유저정보를 남겨둔 채 그 유저의 이름을 “탈퇴한 유저”로 저장하고, unique로 설정된 유저 아이디를 중복되지 않게 랜덤값을 추가해추후 같은 아이디로 회원가입이 가능하게 해주었다

![image](https://github.com/helloCar-2/helloCar/assets/144636282/38a1c559-05ac-4f75-a2d8-bf774006ccd7)

   
</details>
