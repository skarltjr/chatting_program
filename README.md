# chatting_program_server
chatting_program using socket & multiThread
- 클라이언트 : https://github.com/skarltjr/chatting_program_client

### 개요
- socket을 활용한 클라이언트,서버 1:1 채팅 프로그램
- accpet는 새로운 스레드를 할당하여 담당

### 주요 사항
- 채팅 프로그램에 대해 고민해봤을 때 꼭 상대가 보낸 메세지를 읽은 후 내 메세지를 작성할 필요가 없다.
- 즉 send thread / receive thread를 따로 두는 것도 좋다고 생각

### 동작
- 서버는 port만 지정해줬기 때문에 inetAddrAny처럼 host컴퓨터 ip사용
- 1. 서버 start
- 2. 클라이언트 start - 서버(여기선 localhost)로 connect    
- 3. 먼저 입력하는 쪽이 먼저 send
- 4. quit을 입력하기 전까지 진행 ...    






