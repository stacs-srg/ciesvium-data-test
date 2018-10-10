package uk.ac.standrews.cs.data;
import uk.ac.standrews.cs.utilities.dataset.encrypted.EncryptedDataSet;

public class ExampleDataSet extends EncryptedDataSet {

    public ExampleDataSet() throws Exception {
        super(
                ExampleDataSet.class.getResourceAsStream("plain_text.csv.enc"),
                ExampleDataSet.class.getResourceAsStream("encrypted_key.txt"));
    }
}