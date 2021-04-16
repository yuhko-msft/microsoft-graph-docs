---
title: "Get groupPolicyMigrationReport"
description: "Read the properties and relationships of a groupPolicyMigrationReport object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get groupPolicyMigrationReport
Namespace: microsoft.graph



Read the properties and relationships of a [groupPolicyMigrationReport](../resources/grouppolicymigrationreport.md) object.

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
GET /deviceManagement/groupPolicyMigrationReports/{groupPolicyMigrationReportId}
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a [groupPolicyMigrationReport](../resources/grouppolicymigrationreport.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_grouppolicymigrationreport"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/deviceManagement/groupPolicyMigrationReports/{groupPolicyMigrationReportId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.groupPolicyMigrationReport"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.groupPolicyMigrationReport",
    "id": "f8103551-3551-f810-5135-10f8513510f8",
    "createdDateTime": "String (timestamp)",
    "displayName": "String",
    "groupPolicyCreatedDateTime": "String (timestamp)",
    "groupPolicyLastModifiedDateTime": "String (timestamp)",
    "groupPolicyObjectId": "Guid",
    "lastModifiedDateTime": "String (timestamp)",
    "migrationReadiness": "String",
    "ouDistinguishedName": "String",
    "supportedSettingsCount": "Integer",
    "supportedSettingsPercent": "Integer",
    "targetedInActiveDirectory": "Boolean",
    "totalSettingsCount": "Integer"
  }
}
```

