# 계약 리스크 감지 시스템 (Contract Risk Detector)

## 🗂 프로젝트 소개 | Project Overview

### 🇰🇷 한국어
- 이 프로젝트는 공공 및 금융 도메인에서 반복적으로 작성되는 계약서 또는 제안서의 리스크를 자동으로 감지하고 알림을 제공하기 위한 시스템입니다.  
- Spring Boot 기반의 REST API 서버로 구성되어 있으며, 향후 NLP 기술 및 간단한 머신러닝 모델을 활용해 리스크 요소를 식별하는 기능을 포함할 예정입니다.

### 🌎 English
- This project is a system designed to automatically detect risks in contracts or proposals frequently used in the public and financial sectors.  
- It is implemented as a Spring Boot-based REST API server.  
In the future, it will incorporate NLP and lightweight machine learning models to identify potential risk elements.

## 🚀 기술 스택 | Tech Stack

- Java 17
- Spring Boot 3.4.5
- Gradle
- RESTful API

## 📁 프로젝트 구조 | Project Structure

```
com.seunghae.contractrisk
├── controller       # REST API Controllers
├── service          # Business Logic Layer
├── dto              # Data Transfer Objects
└── domain           # Domain Models
```

## 🛠 실행 방법 | How to Run

```bash
./gradlew bootRun
```

## ✍️ 향후 계획 | Future Plans

- 계약 텍스트 업로드 및 파싱
- 기본적인 룰 기반 리스크 감지
- AI 기반 리스크 감지 모델 연동
- 관리자 UI (Spring MVC 또는 React)
