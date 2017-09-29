package org.melsif.model;

import javax.persistence.*;

/**
 * Created by fliou on 28/09/17.
 */

@Entity
@DiscriminatorValue("administrateur")
public class Administrateur extends User {
}
