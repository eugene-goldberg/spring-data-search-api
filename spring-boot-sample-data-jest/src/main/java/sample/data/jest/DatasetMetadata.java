package sample.data.jest;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "dataset", type = "metadata", shards = 1, replicas = 0, refreshInterval = "-1")
public class DatasetMetadata {

    @Id
    private String id;

    private String datasetName;

    public DatasetMetadata() {
    }

    public DatasetMetadata( String datasetName) {
        this.datasetName = datasetName;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDatasetName() {
        return this.datasetName;
    }

    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    @Override
    public String toString() {
        return String.format("Dataset[id=%s, datasetName='%s']", this.id,
                this.datasetName);
    }
}
