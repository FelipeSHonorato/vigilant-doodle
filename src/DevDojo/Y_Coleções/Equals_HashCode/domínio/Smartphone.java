package DevDojo.Y_Coleções.Equals_HashCode.domínio;

public class Smartphone {
    private String serialNumber;
    private String marca;

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    //***************************************************************
    //Sobrescrevemos o Equals e o HasCode quando queremos especificar uma comparação válida, no caso
    //utilizamos como atributo o serialNumber, porque em um celular se ambos contem mesmo serial
    //tecnicamente os dois são o mesmo celular

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false; //Primeiro comparamos se obj é nulo -> false
        if (this == obj) return true; //Comparamos se eles são iguais -> true
        if (this.getClass() != obj.getClass()) return false; //Comparamos se são diferentes -> false
        Smartphone smartphone = (Smartphone) obj; //Fazemos um cast Smartphone no obj porque já sabemos que é um Smartphone
        return serialNumber != null && serialNumber.equals(smartphone.serialNumber);
        //Se o serialNumber não for nulo e serialNumber for igual ao obj -> true
    }

    //Sobrescrevemos o HashCode utilizando o mesmo atributo de Equals no caso serialNumber
    @Override
    public int hashCode() {
        return serialNumber == null ? 0 : this.serialNumber.hashCode();
    }
    //***************************************************************


    @Override
    public String toString() {
        return "Smartphone{" +
                "serialNumber='" + serialNumber + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
