
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class RedimensionarImagem {

    static final int LARGURA = 100;
    static final int ALTURA = 100;

    public static void main(String[] args) {
        try {

            File arquivoOriginal = new File("C:\\repositorios\\javaEstudos\\redimensionarImagens\\fotos\\foto.jpeg");
            BufferedImage imagemOriginal = ImageIO.read(arquivoOriginal);

            BufferedImage imagemRedimensionada = new BufferedImage(LARGURA, ALTURA, BufferedImage.TYPE_INT_RGB);
            Graphics2D g2d = imagemRedimensionada.createGraphics();
            g2d.drawImage(imagemOriginal.getScaledInstance(LARGURA, ALTURA, Image.SCALE_SMOOTH), 0, 0, null);
            g2d.dispose();

            File arquivoSaida = new File("C:\\repositorios\\javaEstudos\\redimensionarImagens\\fotos\\foto_remimensionada.jpg");
            ImageIO.write(imagemRedimensionada, "jpg", arquivoSaida);

            System.out.println("Imagem redimensionada com sucesso!");
            System.out.println("Tamanho: " + LARGURA + "x" + ALTURA);

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
