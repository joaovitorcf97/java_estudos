package OOP.enums;

public class Main {
    public static void main(String[] args) {
        SituacaoPedido situacaoPedido = SituacaoPedido.ENVIADO;

        switch (situacaoPedido) {
            case SOLICITADO:
                System.out.println("Pedido solicitado.");
                break;
            case ENVIADO:
                System.out.println("Pedido enviado.");
                break;
            case EM_PREPARACAO:
                System.out.println("Pedido em preparação");
                break;
            case ENTREGUE:
                System.out.println("Pedido entregue");
                break;
            default:
                System.out.println("Situação do pedido desconhecida.");
                break;
        }

        for (SituacaoPedido situacaoPedido2 : SituacaoPedido.values()) {
            System.out.println(situacaoPedido2);
        }

        System.out.println("============================================");

        System.out.println(Cor.VERMELHO.getCodigoHex());
        System.out.println(Cor.VERMELHO.getColor());
    }
}
