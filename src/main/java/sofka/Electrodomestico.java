package sofka;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Electrodomestico {

    private String nombre;
    private Integer cantidad;
    private Character consumo;
    private Boolean esNacional;

    public Double CalcularPrecioFinal(Character consumo, Boolean esNacional){
        return calcularValorConsumo(consumo)+ calcularValorProcedencia(esNacional);
    }

    public Double calcularValorConsumo(Character consumo){
        switch (consumo){
            case 'A':
                return  450000.0;
            case 'B':
                return 350000.0;
            case 'C':
                return 250000.0;
            default:
                throw  new IllegalArgumentException("Consumo solo puede ser 'A', 'B' o 'C'");
        }

    }

    public Double calcularValorProcedencia(Boolean esNacional){
        if(esNacional){
            return 250000.0;
        }else{
            return 350000.0;
        }
    }
}
