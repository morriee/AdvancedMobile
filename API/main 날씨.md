날씨
==========
기상청 공공 api 종관기상관측 일자료 사용

## 1. 기상청 공공api 사용신청
                요청 주소 : https://data.kma.go.kr/apiData/getData
                인증키 : Gc5tmmsRxVr3aeIQz6hsHse6Tt4OqzLJ9JNWJJO7hywZojnNQqCwaCMn8BftiZIj
                형식 : xml

## 2. api 조회 필수 요청 메세지
                type	교환 데이터 타입	      json	   교환 데이터 타입을 선정
              dataCd	자료 코드	     	      ASOS	   자료 분류 코드
              dateCd	날짜 코드	     	   DAY	     날짜 분류 코드 
              startDt	시작일	       	       20100101	조회 기간 시작일
              endDt	  종료일		             20100601	조회 기간 종료일
              stnIds	지점 번호	   	        108	     종관기상관측 지점 번호
              schListCnt	한 페이지 결과수		10	     한 페이지 결과 수
              pageIndex	페이지 번호	       1	       페이지 번호
              apiKey	사용자            		사용자 api 키
              
              ex) http://data.kma.go.kr/apiData/getData?type=xml&dataCd=ASOS&dateCd=DAY&startDt=20100101&endDt=20100102&stnIds=108&schListCnt=10&pageIndex=1&apiKey=사용자api키
              
## 3.안드로이드 xml 파싱


참고 링크
https://coding-factory.tistory.com/39
