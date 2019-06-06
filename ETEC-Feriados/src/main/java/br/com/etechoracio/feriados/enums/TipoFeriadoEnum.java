package br.com.etechoracio.feriados.enums;

public enum TipoFeriadoEnum {
	
	MUNICIPAL("Municipal"),
	ESTADUAL("Estadual"),
	NACIONAL("Nacional");
	
	
	
	private String label;

    private TipoFeriadoEnum(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return label;
    }

    public static TipoFeriadoEnum getBy(int ordinal) {
        return TipoFeriadoEnum.values()[ordinal];
    }

}
