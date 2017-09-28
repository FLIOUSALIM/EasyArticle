package org.melsif.model;

import javax.persistence.*;

/**
 * Created by fliou on 28/09/17.
 */

@Entity
@DiscriminatorValue("redacteur")
public class Redacteur extends Utilisateur {
}
