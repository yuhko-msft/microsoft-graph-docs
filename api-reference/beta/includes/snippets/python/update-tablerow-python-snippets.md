---
description: "Automatically generated file. DO NOT MODIFY"
---

```python

// THE PYTHON SDK IS IN PREVIEW. NON-PRODUCTION USE ONLY
client =  GraphServiceClient(request_adapter)

request_body = WorkbookTableRow()
request_body.Index = 99

request_body.values = 'values-value'




result = await client.drives.by_drive_id('drive-id').items.by_item_id('driveItem-id').workbook.tables.by_table_id('workbookTable-id').rows.by_row_id('workbookTableRow-id').patch(request_body = request_body)


```