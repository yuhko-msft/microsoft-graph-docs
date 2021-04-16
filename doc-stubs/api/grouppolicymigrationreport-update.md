---
title: "Update groupPolicyMigrationReport"
description: "Update the properties of a groupPolicyMigrationReport object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update groupPolicyMigrationReport
Namespace: microsoft.graph



Update the properties of a [groupPolicyMigrationReport](../resources/grouppolicymigrationreport.md) object.

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
PATCH /deviceManagement/groupPolicyMigrationReports/{groupPolicyMigrationReportId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [groupPolicyMigrationReport](../resources/grouppolicymigrationreport.md) object.

The following table shows the properties that are required when you update the [groupPolicyMigrationReport](../resources/grouppolicymigrationreport.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdDateTime|DateTimeOffset|The date and time at which the GroupPolicyMigrationReport was created.|
|displayName|String|The name of Group Policy Object from the GPO Xml Content|
|groupPolicyCreatedDateTime|DateTimeOffset|The date and time at which the GroupPolicyMigrationReport was created.|
|groupPolicyLastModifiedDateTime|DateTimeOffset|The date and time at which the GroupPolicyMigrationReport was last modified.|
|groupPolicyObjectId|Guid|The Group Policy Object GUID from GPO Xml content|
|lastModifiedDateTime|DateTimeOffset|The date and time at which the GroupPolicyMigrationReport was last modified.|
|migrationReadiness|groupPolicyMigrationReadiness|The Intune coverage for the associated Group Policy Object file. Possible values are: `none`, `partial`, `complete`, `error`, `notApplicable`.|
|ouDistinguishedName|String|The distinguished name of the OU.|
|supportedSettingsCount|Int32|The number of Group Policy Settings supported by Intune.|
|supportedSettingsPercent|Int32|The Percentage of Group Policy Settings supported by Intune.|
|targetedInActiveDirectory|Boolean|The Targeted in AD property from GPO Xml Content|
|totalSettingsCount|Int32|The total number of Group Policy Settings from GPO file.|



## Response

If successful, this method returns a `200 OK` response code and an updated [groupPolicyMigrationReport](../resources/grouppolicymigrationreport.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_grouppolicymigrationreport"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/groupPolicyMigrationReports/{groupPolicyMigrationReportId}
Content-Type: application/json
Content-length: 477

{
  "@odata.type": "#microsoft.graph.groupPolicyMigrationReport",
  "displayName": "String",
  "groupPolicyCreatedDateTime": "String (timestamp)",
  "groupPolicyLastModifiedDateTime": "String (timestamp)",
  "groupPolicyObjectId": "Guid",
  "migrationReadiness": "String",
  "ouDistinguishedName": "String",
  "supportedSettingsCount": "Integer",
  "supportedSettingsPercent": "Integer",
  "targetedInActiveDirectory": "Boolean",
  "totalSettingsCount": "Integer"
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
```

