package com.company;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    private static final int PORT = 8080;
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;
        try {
            // bind
            serverSocket = new ServerSocket(PORT);
            // accept
            socket = serverSocket.accept();
            // accept 이후 메세진 송 수신을 각 스레드를 새로 할당하여 담당
            SenderThread senderThread = new SenderThread(socket);
            ReceiveThread receiveThread = new ReceiveThread(socket);
            senderThread.start();
            receiveThread.start();
        } catch (IOException exception) {
            exception.printStackTrace();
        } finally {
            // 모두 종료 후 serversocket close
            try {
                serverSocket.close();
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
    }
}
