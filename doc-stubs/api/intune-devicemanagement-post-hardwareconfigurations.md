---
title: "Create hardwareConfiguration"
description: "Create a new hardwareConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create hardwareConfiguration
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new hardwareConfiguration object.

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
POST /deviceManagement/hardwareConfigurations
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [hardwareConfiguration](../resources/intune-hardwareconfiguration.md) object.

You can specify the following properties when creating a **hardwareConfiguration**.

|Property|Type|Description|
|:---|:---|:---|
|version|Int32|**TODO: Add Description** Required.|
|displayName|String|**TODO: Add Description** Required.|
|description|String|**TODO: Add Description** Optional.|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Required.|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Required.|
|fileName|String|**TODO: Add Description** Required.|
|configurationFileContent|Binary|**TODO: Add Description** Required.|
|hardwareConfigurationFormat|hardwareConfigurationFormat|**TODO: Add Description**. The possible values are: `dell`, `surface`, `surfaceDock`. Required.|
|roleScopeTagIds|String collection|**TODO: Add Description** Optional.|
|perDevicePasswordDisabled|Boolean|**TODO: Add Description** Required.|



## Response

If successful, this method returns a `201 Created` response code and a [hardwareConfiguration](../resources/intune-hardwareconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_hardwareconfiguration_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/deviceManagement/hardwareConfigurations
Content-Type: application/json
Content-length: 341

{
  "@odata.type": "#microsoft.graph.hardwareConfiguration",
  "version": "Integer",
  "displayName": "String",
  "description": "String",
  "fileName": "String",
  "configurationFileContent": "Binary",
  "hardwareConfigurationFormat": "String",
  "roleScopeTagIds": [
    "String"
  ],
  "perDevicePasswordDisabled": "Boolean"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.hardwareConfiguration"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.hardwareConfiguration",
  "id": "c1b9e62e-e62e-c1b9-2ee6-b9c12ee6b9c1",
  "version": "Integer",
  "displayName": "String",
  "description": "String",
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "fileName": "String",
  "configurationFileContent": "Binary",
  "hardwareConfigurationFormat": "String",
  "roleScopeTagIds": [
    "String"
  ],
  "perDevicePasswordDisabled": "Boolean"
}
```

