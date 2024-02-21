# 소개. BlogService
------------------
-블로그 검색과 관련된 서비스를 제공합니다.

# 빌드 결과물
---------------------
- [결과물 다운로드](https://google.com)

# 환경소개
- JAVA 17
- SpringBoot 2.7.3
- ...


# module - application
---------------
- 도메인 엔티티, 입력포트
  - `domain`
  - `service`
  - `port/input`
  - `port/output`

### 사용

 > $ http GET 'http://localhost:8080/api/v1/blogs>keyword=SpringFramework'


### 요청

Parameter


| Name | Type |     Description      | Required |
|:---|----|:--:|----|
| `keyword` | `String `|        검색 키워드        | O |
| `url` | `String` | 블로그 url | X |