/*
 * (C) Copyright 2014 
 *
 * Univesidad Tecnológica Nacional - Facultad Regional Resistencia.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ar.edu.utn.frre.dacs.sample.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.joda.time.LocalDate;
import org.joda.time.Years;

/**
 * Representa un cliente en la aplicaci&oacute;n.
 * @author Jorge E. Villaverde
 * @version 1.0.0
 * @since 1.0.0
 */
@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {
	
	// Constants --------------------------------------------------------------
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 5387123043028108767L;

	// Properties -------------------------------------------------------------
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

	@NotNull
	@Min(0)
    @Column(name = "dni", nullable = false)
    private Long dni;

    @NotNull
    @Size(min = 2, max = 50)
    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;
    
    @NotNull
    @Size(min = 2, max = 50)
    @Column(name = "apellido", length = 50, nullable = false)
    private String apellido;
    
    @NotNull
    @Past
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_nacimiento", nullable = false)
    private Date fechaNacimiento;
    
    @Size(max = 20)
    @Column(name = "telefono", length = 20)
    private String telefono;
    
    @Size(max = 50)
    @Column(name = "direccion", length = 50)
    private String direccion;

    // Constructors -----------------------------------------------------------
    
    // Getters/Setters --------------------------------------------------------
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getDni() {
		return dni;
	}

	public void setDni(Long dni) {
		this.dni = dni;
	}
    
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

    // Overrides --------------------------------------------------------------

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellido="
				+ apellido + "]";
	}
	
	// Actions ----------------------------------------------------------------
	
	/**
	 * Retorna la edad del cliente en base a la fecha de nacimiento y la 
	 * fecha actual.
	 * @return Edad del Cliente.
	 */
	public int getEdad() {
		if(fechaNacimiento == null)
			return 0;
		
		LocalDate birthdate = new LocalDate (fechaNacimiento.getTime());
		LocalDate now = new LocalDate();
		Years age = Years.yearsBetween(birthdate, now);
		
		return age.getYears();
	}

}
