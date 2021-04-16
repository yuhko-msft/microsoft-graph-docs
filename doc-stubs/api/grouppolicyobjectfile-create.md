---
title: "Create groupPolicyObjectFile"
description: "Create a new groupPolicyObjectFile object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create groupPolicyObjectFile
Namespace: microsoft.graph



Create a new [groupPolicyObjectFile](../resources/grouppolicyobjectfile.md) object.

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
POST /deviceManagement/groupPolicyObjectFiles
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [groupPolicyObjectFile](../resources/grouppolicyobjectfile.md) object.

The following table shows the properties that are required when you create the [groupPolicyObjectFile](../resources/grouppolicyobjectfile.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|content|String|The Group Policy Object file content.|
|createdDateTime|DateTimeOffset|The date and time at which the GroupPolicy was first uploaded.|
|groupPolicyObjectId|Guid|The Group Policy Object GUID from GPO Xml content|
|lastModifiedDateTime|DateTimeOffset|The date and time at which the GroupPolicyObjectFile was last modified.|
|ouDistinguishedName|String|The distinguished name of the OU.|



## Response

If successful, this method returns a `201 Created` response code and a [groupPolicyObjectFile](../resources/grouppolicyobjectfile.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_grouppolicyobjectfile_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/groupPolicyObjectFiles
Content-Type: application/json
Content-length: 157

{
  "@odata.type": "#microsoft.graph.groupPolicyObjectFile",
  "content": "String",
  "groupPolicyObjectId": "Guid",
  "ouDistinguishedName": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.groupPolicyObjectFile"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.groupPolicyObjectFile",
  "id": "f05c45dc-45dc-f05c-dc45-5cf0dc455cf0",
  "content": "String",
  "createdDateTime": "String (timestamp)",
  "groupPolicyObjectId": "Guid",
  "lastModifiedDateTime": "String (timestamp)",
  "ouDistinguishedName": "String"
}
```

