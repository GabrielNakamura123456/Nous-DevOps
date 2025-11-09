import java.io.IOException;
import java.net.InetSocketAddress;
import com.sun.net.httpserver.HttpServer;

public class NousApi {
    public static void main(String[] args) throws IOException {
        int porta = 8080;

        // Sobe um servidor HTTP nativo do JDK
        HttpServer server = HttpServer.create(new InetSocketAddress(porta), 0);
        server.createContext("/", exchange -> {
            String response = "Servidor NOUS API do Aluno rodando com sucesso!";
            exchange.getResponseHeaders().add("Content-Type", "text/plain; charset=UTF-8");
            exchange.sendResponseHeaders(200, response.getBytes().length);
            exchange.getResponseBody().write(response.getBytes());
            exchange.close();
        });

        server.start();
        System.out.println("✅ Servidor rodando em http://localhost:" + porta);
    }
}
