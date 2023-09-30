public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "T"; // M / T


        // If - else if
        //if (plano == "B") {
        //    System.out.println("100 minutos de ligação");
        //} else if (plano == "M") {
        //    System.out.println("100 minutos de ligação");
        //    System.out.println("WhatsApp e Instagram grátis");
        //} else if (plano == "T") {
        //    System.out.println("100 minutos de ligação");
        //    System.out.println("WhatsApp e Instagram grátis");
        //    System.out.println("5Gb Youtube");
        //}
            //switch case
        switch (plano) {
            case "B": {
                System.out.println("100 minutos de ligação");
                break;
            }
            case "M": {
                System.out.println("Whats e Insta grátis");
                break;
            }
            case "T": {
                System.out.println("Whats e Insta e 5G grátis");
                break;
            }

        }

    }
}
