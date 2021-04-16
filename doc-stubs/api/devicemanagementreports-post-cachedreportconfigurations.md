---
title: "Create deviceManagementCachedReportConfiguration"
description: "Create a new deviceManagementCachedReportConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create deviceManagementCachedReportConfiguration
Namespace: microsoft.graph



Create a new deviceManagementCachedReportConfiguration object.

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
POST /deviceManagement/reports/cachedReportConfigurations
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceManagementCachedReportConfiguration](../resources/devicemanagementcachedreportconfiguration.md) object.

The following table shows the properties that are required when you create the [deviceManagementCachedReportConfiguration](../resources/devicemanagementcachedreportconfiguration.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|expirationDateTime|DateTimeOffset|Time that the cached report expires|
|filter|String|Filters applied on report creation.|
|lastRefreshDateTime|DateTimeOffset|Time that the cached report was last refreshed|
|metadata|String|Caller-managed metadata associated with the report|
|orderBy|String collection|Ordering of columns in the report|
|reportName|String|Name of the report|
|select|String collection|Columns selected from the report|
|status|deviceManagementReportStatus|Status of the cached report. Possible values are: `unknown`, `notStarted`, `inProgress`, `completed`, `failed`.|



## Response

If successful, this method returns a `201 Created` response code and a [deviceManagementCachedReportConfiguration](../resources/devicemanagementcachedreportconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_devicemanagementcachedreportconfiguration_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/reports/cachedReportConfigurations
Content-Type: application/json
Content-length: 347

{
  "@odata.type": "#microsoft.graph.deviceManagementCachedReportConfiguration",
  "expirationDateTime": "String (timestamp)",
  "filter": "String",
  "lastRefreshDateTime": "String (timestamp)",
  "metadata": "String",
  "orderBy": [
    "String"
  ],
  "reportName": "String",
  "select": [
    "String"
  ],
  "status": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.deviceManagementCachedReportConfiguration"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.deviceManagementCachedReportConfiguration",
  "id": "6ac21618-1618-6ac2-1816-c26a1816c26a",
  "expirationDateTime": "String (timestamp)",
  "filter": "String",
  "lastRefreshDateTime": "String (timestamp)",
  "metadata": "String",
  "orderBy": [
    "String"
  ],
  "reportName": "String",
  "select": [
    "String"
  ],
  "status": "String"
}
```

