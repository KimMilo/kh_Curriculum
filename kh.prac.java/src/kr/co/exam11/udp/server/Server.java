package kr.co.exam11.udp.server;
 
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException; 

public class Server {
	
	public static void main(String[] asrgs) {
		int port = 50000;
		
		try {
			DatagramSocket dSocket = new DatagramSocket(port);
			System.out.println("클라이언트가 접속 할 수 있도록 연결 소켓을 생성 합니다.");
			while(true) {
				byte[] data = new byte[1024];
				DatagramPacket dPacket = new DatagramPacket(data, data.length);
				System.out.println("클라이언트의 연결을 대기 합니다.");
				dSocket.receive(dPacket);
				String clientIp = dPacket.getSocketAddress().toString();
				System.out.println("클라이언트와 연결 되었습니다.");
				System.out.println("연결된 클라이언트의 주소는 " + 
										clientIp + "입니다.");
	
				String recv = new String(dPacket.getData(), 0, dPacket.getData().length);
				System.out.println("클라이언트(" + clientIp + 
									")가 보낸 메시지 : " + recv);
				
				// 서버가 클라이언트에게 메시지를 보냄.
				DatagramPacket sendPacket = new DatagramPacket(recv.getBytes(),
										recv.getBytes().length,
										dPacket.getAddress(),
										dPacket.getPort());
				
				dSocket.send(dPacket);
			}
		}catch (SocketException e) {
			e.printStackTrace(); // 중복되는 Port가 있으면 뜸.
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
