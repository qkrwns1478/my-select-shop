| 기능 | 메서드 | URL | 응답 |
|---|---|---|---|
| 관심 상품 등록하기 | POST | `/api/products` | ProductResponseDto |
| 관심 상품의 희망 최저가 업데이트 | PUT | `/api/products/{id}` | ProductResponseDto |
| 관심 상품 조회하기 | GET | `/api/products` | List<ProductResponseDto> |

| 기능 | 메서드 | URL | 설명 |
|---|---|---|---|
| 로그인 페이지 | GET | `/api/user/login-page` | 회원가입 페이지 호출 |
| 회원가입 페이지 | GET | `/api/user/signup` | 회원가입 페이지 호출 |
| 회원가입 | POST | `/api/user/signup` | 회원가입 |
| 회원 정보 요청 | GET | `/api/user-info` | 회원 관련 정보 받기 |