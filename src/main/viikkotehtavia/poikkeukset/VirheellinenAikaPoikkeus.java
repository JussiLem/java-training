package main.viikkotehtavia.poikkeukset;

/* VirheellinenAikaPoikkeus perii RuntimeException-luokan,
 * eli sitä voidaan käyttää poikkeuksena: */
public class VirheellinenAikaPoikkeus extends RuntimeException {

    public VirheellinenAikaPoikkeus(String virheviesti) {

        // Annetaan virheilmoitus eteenpäin yläluokan konstruktorille
        super(virheviesti);

    }
}