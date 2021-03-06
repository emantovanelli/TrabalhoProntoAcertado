package nosso.br.edu.ifes.sr.poo2.api.model;

import java.io.Serializable;





public abstract class ModelModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}	
	
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ModelModel) {
        	ModelModel o = (ModelModel) obj;
            if (this.id != null && this.id == o.id) {
                return true;
            }
        }
        return false;
    }
}
