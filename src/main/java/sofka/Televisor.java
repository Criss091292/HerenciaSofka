package sofka;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Televisor extends Electrodomestico{
    private Boolean esSintonizador;
    private Integer tamanioEnPulgadas;

    public Double calcularPrecioFinal(Character consumo, Boolean esNacional, Integer tamanioEnPulgadas, Boolean esSintonizador){
        if(tamanioEnPulgadas>40){
            if(!esSintonizador){
                return (super.CalcularPrecioFinal(consumo,esNacional))*1.3;
            }else{
                return (super.CalcularPrecioFinal(consumo,esNacional))*1.3 + 250000;
            }
        }else{
            if(!esSintonizador){
                return super.CalcularPrecioFinal(consumo,esNacional);
            }else{
                return super.CalcularPrecioFinal(consumo,esNacional) +250000;
            }
        }

    }
}
