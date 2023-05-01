package kr.co.exam11.tcp.client;
 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		
		//TCP
		Scanner sc = new Scanner(System.in);
		//byte serverIp[] = {127, 0, 0, 1};
		// local ip 127,0,0,1
		// 해당컴퓨터 ip 192.168.20.3
		
		//클라이언트가 연결 요청할 서버의 Ip 와 Port를 지정
		int serverPort = 50000;
		String serverIp = "127.0.0.1";
		try {
			//InetAddress serverInet = InetAddress.getByAddress(serverIp);
			
			// 서버에 연결
			Socket sock = new Socket(serverIp, serverPort);
			// local ip가 아닌 실제 컴퓨터 ip주소를 serverInet자리에 문자열로 입력해도 됨.
			// cmd에서 ipconfig입력하면 실제 ip주소 확인 가능
						
			// 연결된 소켓으로 통신을 위한 입/출력 스트림 생성
			BufferedReader br = new BufferedReader(
											new InputStreamReader(sock.getInputStream()));
			BufferedWriter bw = new BufferedWriter(
											new OutputStreamWriter(sock.getOutputStream()));
			
			while(true) {
				System.out.print("서버에 보낼 메시지 입력 : ");
				String msg = sc.nextLine();
				
				bw.write(msg);
				bw.newLine();
				
				// 네트워크 통신에서 flush 를 하지 않으면(UDP는 안해도 되는것 같음) 서버에 데이터가 전달 되지 않음
				bw.flush();
			}
					
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sc.close();
	}
}