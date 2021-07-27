# UIUC Hammock Spots

UIUC (University of Illinois at Urbana-Champaign) tree data was taken from the [Campus Tree Inventory](https://icap.sustainability.illinois.edu/project/campus-tree-inventory) project which contains a dataset which inventoried each tree on campus.

## Project Organization

```
/data
    -- Tree data (laditude, longitude, age, etc)
/uiuc-hammock-spots-api
    -- Java API using Dropwizard
/uiuc-hammock-spots-ui
    -- React frontend using TypeScript
/scripts
    -- Python scripts for uploading tree / calculating tree distance data and persisting them to AWS RDS MySQL
```

## `/scripts`

It is recommended to use a Python virtual environment (`venv`)

### Installing Dependencies

```bash
pip install -r requirements.txt
```
