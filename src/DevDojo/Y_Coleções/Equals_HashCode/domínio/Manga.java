package DevDojo.Y_Coleções.Equals_HashCode.domínio;

import java.util.Objects;

public class Manga implements Comparable<Manga> {
    private Long id;
    private String nome;
    private double preco;

    public Manga(Long id, String nome, double preco) {
        Objects.requireNonNull(id, "Id não pode ser nulo");
        Objects.requireNonNull(nome, "Nome não pode ser nulo");
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Double.compare(manga.preco, preco) == 0 && id.equals(manga.id) && nome.equals(manga.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, preco);
    }

    //Sobrescresvendo compareTo para estipular onde o Java deve fazer a comparação
    @Override
    public int compareTo(Manga outroManga) {

        // Método possível para reescrever o compareTo e indicar onde deve ser feita a comparação (id)
//        if (this.id < outroManga.getId()) {
//            return -1;
//        }
//        if (this.id.equals(outroManga.getId())) {
//            return 0;
//        } else {
//            return 1;
//        }

        //Código acima somente em 1 linha, porem somente para Wrappers
//        return this.id.compareTo(outroManga.getId());

        //Código acima somente em 1 linha, convertendo primitivo para Wrapper
        return Double.valueOf(preco).compareTo(outroManga.getPreco());
    }
}