---
title: "Update deviceManagementExportJob"
description: "Update the properties of a deviceManagementExportJob object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update deviceManagementExportJob
Namespace: microsoft.graph



Update the properties of a [deviceManagementExportJob](../resources/devicemanagementexportjob.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|**TODO: Provide applicable permissions.**|
|Delegated (personal Microsoft account)|**TODO: Provide applicable permissions.**|
|Application|**TODO: Provide applicable permissions.**|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
PATCH /deviceManagement/reports/exportJobs/{deviceManagementExportJobId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceManagementExportJob](../resources/devicemanagementexportjob.md) object.

The following table shows the properties that are required when you update the [deviceManagementExportJob](../resources/devicemanagementexportjob.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|expirationDateTime|DateTimeOffset|Time that the exported report expires|
|filter|String|Filters applied on the report|
|format|deviceManagementReportFileFormat|Format of the exported report. Possible values are: `csv`, `pdf`.|
|localizationType|deviceManagementExportJobLocalizationType|Configures how the requested export job is localized. Possible values are: `localizedValuesAsAdditionalColumn`, `replaceLocalizableValues`.|
|reportName|String|Name of the report|
|requestDateTime|DateTimeOffset|Time that the exported report was requested|
|select|String collection|Columns selected from the report|
|snapshotId|String|A snapshot is an identifiable subset of the dataset represented by the ReportName. A sessionId or CachedReportConfiguration id can be used here. If a sessionId is specified, Filter, Select, and OrderBy are applied to the data represented by the sessionId. Filter, Select, and OrderBy cannot be specified together with a CachedReportConfiguration id.|
|status|deviceManagementReportStatus|Status of the export job. Possible values are: `unknown`, `notStarted`, `inProgress`, `completed`, `failed`.|
|url|String|Temporary location of the exported report|



## Response

If successful, this method returns a `200 OK` response code and an updated [deviceManagementExportJob](../resources/devicemanagementexportjob.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_devicemanagementexportjob"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/reports/exportJobs/{deviceManagementExportJobId}
Content-Type: application/json
Content-length: 369

{
  "@odata.type": "#microsoft.graph.deviceManagementExportJob",
  "expirationDateTime": "String (timestamp)",
  "filter": "String",
  "format": "String",
  "localizationType": "String",
  "reportName": "String",
  "requestDateTime": "String (timestamp)",
  "select": [
    "String"
  ],
  "snapshotId": "String",
  "status": "String",
  "url": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.deviceManagementExportJob",
  "id": "74c0d390-d390-74c0-90d3-c07490d3c074",
  "expirationDateTime": "String (timestamp)",
  "filter": "String",
  "format": "String",
  "localizationType": "String",
  "reportName": "String",
  "requestDateTime": "String (timestamp)",
  "select": [
    "String"
  ],
  "snapshotId": "String",
  "status": "String",
  "url": "String"
}
```

