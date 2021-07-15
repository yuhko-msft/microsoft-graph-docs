---
title: "Create windowsInformationProtectionAppLockerFile"
description: "Create a new windowsInformationProtectionAppLockerFile object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create windowsInformationProtectionAppLockerFile
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [windowsInformationProtectionAppLockerFile](../resources/windowsinformationprotectionapplockerfile.md) object.

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
POST /windowsInformationProtection/exemptAppLockerFiles
POST /windowsInformationProtection/protectedAppLockerFiles
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windowsInformationProtectionAppLockerFile](../resources/windowsinformationprotectionapplockerfile.md) object.

The following table shows the properties that are required when you create the [windowsInformationProtectionAppLockerFile](../resources/windowsinformationprotectionapplockerfile.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|The friendly name|
|file|Binary|File as a byte array|
|fileHash|String|SHA256 hash of the file|
|version|String|Version of the entity.|



## Response

If successful, this method returns a `201 Created` response code and a [windowsInformationProtectionAppLockerFile](../resources/windowsinformationprotectionapplockerfile.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_windowsinformationprotectionapplockerfile_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/windowsInformationProtection/exemptAppLockerFiles
Content-Type: application/json
Content-length: 181

{
  "@odata.type": "#microsoft.graph.windowsInformationProtectionAppLockerFile",
  "displayName": "String",
  "file": "Binary",
  "fileHash": "String",
  "version": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.windowsInformationProtectionAppLockerFile"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.windowsInformationProtectionAppLockerFile",
  "id": "17711ded-1ded-1771-ed1d-7117ed1d7117",
  "displayName": "String",
  "file": "Binary",
  "fileHash": "String",
  "version": "String"
}
```

