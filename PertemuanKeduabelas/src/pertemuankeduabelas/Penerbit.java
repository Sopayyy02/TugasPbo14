/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuankeduabelas;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author VIVOBOOK 14
 */
@Entity
@Table(name = "penerbit")
@NamedQueries({
    @NamedQuery(name = "Penerbit.findAll", query = "SELECT p FROM Penerbit p"),
    @NamedQuery(name = "Penerbit.findByIdPenerbit", query = "SELECT p FROM Penerbit p WHERE p.idPenerbit = :idPenerbit"),
    @NamedQuery(name = "Penerbit.findByNamaPenerbit", query = "SELECT p FROM Penerbit p WHERE p.namaPenerbit = :namaPenerbit"),
    @NamedQuery(name = "Penerbit.findByAlamat", query = "SELECT p FROM Penerbit p WHERE p.alamat = :alamat")})
public class Penerbit implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_penerbit")
    private Integer idPenerbit;
    @Basic(optional = false)
    @Column(name = "nama_penerbit")
    private String namaPenerbit;
    @Column(name = "alamat")
    private String alamat;
    @OneToMany(mappedBy = "idPenerbit")
    private Collection<Buku> bukuCollection;

    public Penerbit() {
    }

    public Penerbit(Integer idPenerbit) {
        this.idPenerbit = idPenerbit;
    }

    public Penerbit(Integer idPenerbit, String namaPenerbit) {
        this.idPenerbit = idPenerbit;
        this.namaPenerbit = namaPenerbit;
    }

    public Integer getIdPenerbit() {
        return idPenerbit;
    }

    public void setIdPenerbit(Integer idPenerbit) {
        this.idPenerbit = idPenerbit;
    }

    public String getNamaPenerbit() {
        return namaPenerbit;
    }

    public void setNamaPenerbit(String namaPenerbit) {
        this.namaPenerbit = namaPenerbit;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Collection<Buku> getBukuCollection() {
        return bukuCollection;
    }

    public void setBukuCollection(Collection<Buku> bukuCollection) {
        this.bukuCollection = bukuCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPenerbit != null ? idPenerbit.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Penerbit)) {
            return false;
        }
        Penerbit other = (Penerbit) object;
        if ((this.idPenerbit == null && other.idPenerbit != null) || (this.idPenerbit != null && !this.idPenerbit.equals(other.idPenerbit))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pertemuankeduabelas.Penerbit[ idPenerbit=" + idPenerbit + " ]";
    }
    
}
