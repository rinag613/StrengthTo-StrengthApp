package com.example.strengthtostrength.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.strengthtostrength.OrgsItemAdapter;
import com.example.strengthtostrength.R;

 public class OrganizationResources extends AppCompatActivity {

    private int [] orgsImages = {R.drawable.aasts_logo, R.drawable.air_india,R.drawable.asociacion_ayuda_a_las_victimas_del_once,R.drawable.asociacion_victimas_del_terrorism,
    R.drawable.association_francaise_des_victimes_du_terrorism,R.drawable.association_of_victims_of_terrorism_kenya,R.drawable.brent_bereavement_services,
    R.drawable.canadian_coalition_against_terror,R.drawable.cantor_fitzgerald_relief_fund,R.drawable.center_for_legal_studies_on_terrorism,R.drawable.djazairouna_organization_in_algeria,
    R.drawable.federation_national_des_victimes_dattentats,R.drawable.fundacion_colombia_conmemoria,R.drawable.fundacion_el_nogal,R.drawable.heart_nine_eleven,
    R.drawable.international_federation_of_associations_of_victims_of_terrorism,R.drawable.iraqi_al_amal_association,R.drawable.life_for_paris,R.drawable.manchester_survivors_choir,
    R.drawable.natal_israel_trauma_and_resiliency_center,R.drawable.national_emergencies_trust,R.drawable.national_mass_violence_victimization_resource_center,
    R.drawable.omagh_support_and_self_help_group,R.drawable.one_family_fund,R.drawable.one_pulse_foundation,R.drawable.sarz_spirit_foundation,R.drawable.spetember_eleventh_education_trust,
    R.drawable.survivors_against_terror,R.drawable.the_koby_mandell_foundation,R.drawable.the_resilience_in_unity_project,R.drawable.thirteen_onze_fifteen,R.drawable.tikvot,R.drawable.tim_parry_johnathan_ball_peace_foundation,
    R.drawable.tunnels_to_towers_foundation,R.drawable.uganda_muslim_youth_development,R.drawable.v_europe_assaciation_pour_les_victimes_de_terrorisme_belgium,
    R.drawable.victim_support_uk,R.drawable.voices_center_for_resilience,R.drawable.wave_trauma_center,R.drawable.world_trade_caneter_survivors_network};


    //need to add
    private String [] orgsNames = {"Global Organizations Working With Victims of Terrorism","Air India", "Asociacion ayuda a las victimas del 11", "associaction victimes du terrorism", "ASSOCIATION FRANCAISE DES VICTIMES DU TERRORISME",
    "Association of Victims of Terrorism-Kenya", "Brent Bereavement Services", "Canadian Coalition Against Terror", "CantorFitzgerald Relief Fund",
    "Center for Legal studies on Terrorism", "Djazairouna Organization in Algeria" , "Federation National des Victimes Dattentats", "Fundacion Columbia Conmemoria",
    "Fendacion el Nogal", "Heart 911", "International Federation of Association of Victims of Terrorism", "Iraqi Al Amal Association", "Life for Paris",
    "Manchester Survivors Choir", "Natal Israel Trauma and Resiliency Center", "National Emergencies Trust","National Mass Violence Victimization Resource Center",
    "Omagh Support and Self Help","One Family Fund","One Pulse Foundation","Sarz Spirit Foundation","September 11th Education Trust", "Survivors Against Terror",
    "The Koby Mandell Foundation", "The Resilience in Unity Project","13 Onze 15", "Tikvot", "Tin Parry Johnathan Ball Peace Foundation", "Tunnels to Towers Foundation", "Uganda Muslim Youth Development",
    "V Europe Association Pour les Victimes de Terrorisme Belgium", "Victim Support UK","Coices Center for Resilience","Wave Trauma Center","World Trade Center Survivors Network"};

    private String [] orgsAddresses = {"","Ottawa, Ontario, Canada", "Avda. de Canillejas a Vicálvaro 64, 28022, Madrid, Spain","Camino Vinateros, 51 28030 Madrid, Spain",
    "BP 91058 - 75829 Paris cedex 17 France","Nairobi, Kenya","379-381 High Road, Willesden, London NW10 2JR","Toronto, Ontario, Canada","499 Park Avenue, 4th Fl, New York, NY 10022","Buenos Aires, Argentina",
    "BP 411 RP 09000 Blida. Algérie","81, avenue de Villiers 75017 Paris France","Bogotá, Colombia","Bogotá, Colombia",
    "614 Frelinghuysen Avenue, Newark, NJ 07114","5 boulevard Pereire, 75017, Paris, France","Baghdad, Iraq","Paris, France","Manchester, England","Pinhas Rosen St. (Building B, 4th Floor) Tel Aviv, Israel",
    "The National Emergencies Trust, London Scottish House, 95 Horseferry Road, London SW1P 2DX","67 President Street Charleston, SC, 29425","Bridge Centre 5A, Holmview Avenue, Omagh BT79 0AQ Northern Ireland",
    "28 Rachel Imenu, POB 8573, Jerusalem, Israel","PO Box 2126, Orlando, Fl 32802","c/ Atrio Apartments 29 Robertson Street, Fortitude, Valley, Qld, 4006 Australia","275 Bloomfield Avenue, Suite 2A, Caldwell, NJ 07006",
    "","Netzach Yerushalayim 21, POB 12112, Efrat 90435","London, England","24 rue Saint Roch 75001 Paris, France","Tel Aviv, Israel","Peace Drive, Warrington Cheshire WA5 1HQ","2361 Hylan Blvd. Staten Island, NY 10306","Gadaffi Kitangana Lane, Kampala – Uganda, Basiima Close, Kisenyi Road",
    "Brussels, Belgium","1 Bridge Street, Derby, DE1 3HZ","80 Main Street, Suite 5, New Canaan, CT 06840","13 Castlecroft Main Street, Ballymoney BT53 6TD Northern Ireland","511 Ave of the Americas, Suite 302G, New York, NY 10011-8436"};

    private String [] orgsPhones = {"","","91 311 84 32","91 594 07 99","+33 (0) 1 84 79 10 10","","020 8459 6818","","212-829-4770","","00213666610723 or 00213550592568","00213666610723 or 00213550592568","","+ (57) 1 326 77 00","","+33 9 82 47 83 96","07901919285","","+44(0)7748983276",
    "NATAL's Helpline: 800-363-363 or (+972) 732-363-363","","","+44 28 8225 9877 ","+972 2-5399000","407-775-4611","","(973) 216-2623","","02-648-3758","","01 40 39 08 46","+972 54 6456581","+44 1925 581231","(718) 987-1931","+256-777107670 ","","08 08 16 89 111","203-966-3911","+44 28 2766 9900",""};

    private String [] orgsEmails = {"","AirIndiaMemorial@gmail.com","info@ayuda11m.org","","contact@afvt.org","Facebook: @terrorismvictimsalloverkenya","info@bbsonline.org.uk","","Info@cantorrelief.org","","","federation@fenvac.org","","fundacion@clubelnogal.com",
    "info@heart911.org","contact@ifavt.org","baghdad@iraqi-alamal.org","","survivorschoir@gmail.com","info@natal.org.il","Info@nationalemergenciestrust.org.uk","info@nmvvrc.org","","info@onefamilyfund.org","info@onepulsefoundation.org","julie@sarzspiritfoundation.org",
    "","contact@survivorsagainstterror.org.uk","info@kobymandell.org","admin@resilienceinunity.com","contact@13onze15.org","TikvotSports@gmail.com","info@peace-foundation.org.uk","Info@t2t.org","info@umydf.org","contact@v-europe.org","","email@voicescenter.org","","contact@survivorsnet.org"};

    private String [] orgsWebsites={"","","www.ayuda11m.org","www.avt.org"," www.afvt.org","","www.bbsonline.org.uk","www.c-catcanada.org","www.cantorrelief.org","www.celtyv.org","www.djazairouna.com","www.fenvac.org","www.colombiaconmemoria.org","www.fundacionelnogal.org.co",
    "www.heart911.org","www.ifavt.org","www.iraqi-alamal.org","www.lifeforparis.org","Twitter: @survivorschoir","www.natal.org.il","www.nationalemergenciestrust.org.uk",
    "www.nmvvrc.org","","www.onefamilytogether.org","www.onepulsefoundation.org","www.sarzspiritfoundation.org","www.september11educationtrust.org","www.survivorsagainstterror.org.uk"," www.kobymandell.org","www.resilienceinunity.com","www.13onze15.org","www.tikvot.org.il","www.peace-foundation.org.uk",
    "www.t2t.org","www.umydf.org"," www.v-europe.org","www.victimsupport.org.uk","www.voicesofseptember11.org","www.wavetraumacentre.org.uk","www.survivorsnet.org"};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organizations_resources);

        // Create a reference to the RecyclerView in activity_main.xml
        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        // set number of columns to 1 or 2 for portrait or landscape respectively
        // Please note the use of an xml integer here: portrait will be 1x9 and landscape 2x5; neat!
        final int COLUMNS = getResources ().getInteger (R.integer.rv_columns);

        // create and set a Grid Layout Manager to use as the Layout Manager for this RV
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, COLUMNS);
        recyclerView.setLayoutManager(gridLayoutManager);

        // create and set an adapter to use as the Layout Manager for this RV
        OrgsItemAdapter orgsItemAdapter = new OrgsItemAdapter(orgsImages, orgsNames, orgsAddresses, orgsPhones, orgsEmails, orgsWebsites);
        recyclerView.setAdapter(orgsItemAdapter);

    }
}