---
title: "Update unsupportedGroupPolicyExtension"
description: "Update the properties of an unsupportedGroupPolicyExtension object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update unsupportedGroupPolicyExtension
Namespace: microsoft.graph



Update the properties of an [unsupportedGroupPolicyExtension](../resources/unsupportedgrouppolicyextension.md) object.

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
PATCH /deviceManagement/groupPolicyMigrationReports/{groupPolicyMigrationReportId}/unsupportedGroupPolicyExtensions/{unsupportedGroupPolicyExtensionId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [unsupportedGroupPolicyExtension](../resources/unsupportedgrouppolicyextension.md) object.

The following table shows the properties that are required when you update the [unsupportedGroupPolicyExtension](../resources/unsupportedgrouppolicyextension.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|extensionType|String|ExtensionType of the unsupported extension.|
|namespaceUrl|String|Namespace Url of the unsupported extension.|
|nodeName|String|Node name of the unsupported extension.|
|settingScope|groupPolicySettingScope|Setting Scope of the unsupported extension. Possible values are: `unknown`, `device`, `user`.|



## Response

If successful, this method returns a `200 OK` response code and an updated [unsupportedGroupPolicyExtension](../resources/unsupportedgrouppolicyextension.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_unsupportedgrouppolicyextension"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/groupPolicyMigrationReports/{groupPolicyMigrationReportId}/unsupportedGroupPolicyExtensions/{unsupportedGroupPolicyExtensionId}
Content-Type: application/json
Content-length: 186

{
  "@odata.type": "#microsoft.graph.unsupportedGroupPolicyExtension",
  "extensionType": "String",
  "namespaceUrl": "String",
  "nodeName": "String",
  "settingScope": "String"
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
  "@odata.type": "#microsoft.graph.unsupportedGroupPolicyExtension",
  "id": "856f22e4-22e4-856f-e422-6f85e4226f85",
  "extensionType": "String",
  "namespaceUrl": "String",
  "nodeName": "String",
  "settingScope": "String"
}
```

