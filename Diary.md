Diary
==========================

구성
-----------
+ UI
+ 기분
+ 날짜
+ Load
+ Save
+ Delete


* * *


## UI


* * *

## 기분
기분 버튼 클릭
###  
          해, 흐림, 비, 눈 등 radio 버튼으로 선택   

* * *

## 날짜
달력에서 날짜 선택 -> Calendar 에 일정으로도 표시

* * * 

## Save
save 버튼 클릭
### 1. 파일 이름 생성 
           File_Name - 제목 , 내용 , 기분 세가지
### 2. 파일 생성
           FileOutPutStream - openFileOutput ( File_Name, Mode)
### 3. 내용입력
           write - 데이터 작성
### 4. 제목 File_Name 리스트뷰에 정렬

### 5. Calendar 에 일기 작성 표시

파일 저장 후 목록으로 돌아감
    
* * *

## Delete
delete 버튼 클릭
###
         deleteFile(File_Name)
파일 삭제 후 목록으로 돌아감
         
* * *
          
## Load
리스트뷰 목록에서 저장된 메모 클릭
### 1. 파일 이름 불러오기
          FileInputStream - openFileInput( File_Name )
     
### 2. 작성
         read - 작성 되어 있던 text 불러옴
         inputText - text 추가 작성
         
* * *
