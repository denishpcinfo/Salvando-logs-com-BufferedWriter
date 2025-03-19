import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class PDVLoggerAvancado {
    private static final String LOG_FILE = "logs/pdv_detalhado.log";

    public static void registrarEvento(String mensagem) {
        String logEntry = LocalDateTime.now() + " - " + mensagem;
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(LOG_FILE, true))) {
            writer.write(logEntry);
            writer.newLine(); // Quebra de linha
        } catch (IOException e) {
            System.err.println("Erro ao gravar log: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        registrarEvento("Item adicionado: Produto A, Quantidade: 2, Valor: R$ 100,00");
        registrarEvento("Pagamento realizado via Pix.");
        registrarEvento("Cupom fiscal gerado.");
    }
}
