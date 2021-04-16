---
title: "Create groupPolicyDefinitionFile"
description: "Create a new groupPolicyDefinitionFile object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create groupPolicyDefinitionFile
Namespace: microsoft.graph



Create a new groupPolicyDefinitionFile object.

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
POST /deviceManagement/groupPolicyDefinitionFiles
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [groupPolicyDefinitionFile](../resources/grouppolicydefinitionfile.md) object.

The following table shows the properties that are required when you create the [groupPolicyDefinitionFile](../resources/grouppolicydefinitionfile.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|description|String|The localized description of the policy settings in the ADMX file. The default value is empty.|
|displayName|String|The localized friendly name of the ADMX file.|
|languageCodes|String collection|The supported language codes for the ADMX file.|
|lastModifiedDateTime|DateTimeOffset|The date and time the entity was last modified.|
|policyType|groupPolicyType|Specifies the type of group policy. Possible values are: `admxBacked`, `admxIngested`.|
|revision|String|The revision version associated with the file.|
|targetNamespace|String|Specifies the URI used to identify the namespace within the ADMX file.|
|targetPrefix|String|Specifies the logical name that refers to the namespace within the ADMX file.|



## Response

If successful, this method returns a `201 Created` response code and a [groupPolicyDefinitionFile](../resources/grouppolicydefinitionfile.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_grouppolicydefinitionfile_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/groupPolicyDefinitionFiles
Content-Type: application/json
Content-length: 278

{
  "@odata.type": "#microsoft.graph.groupPolicyDefinitionFile",
  "description": "String",
  "displayName": "String",
  "languageCodes": [
    "String"
  ],
  "policyType": "String",
  "revision": "String",
  "targetNamespace": "String",
  "targetPrefix": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.groupPolicyDefinitionFile"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.groupPolicyDefinitionFile",
  "id": "35d87cde-7cde-35d8-de7c-d835de7cd835",
  "description": "String",
  "displayName": "String",
  "languageCodes": [
    "String"
  ],
  "lastModifiedDateTime": "String (timestamp)",
  "policyType": "String",
  "revision": "String",
  "targetNamespace": "String",
  "targetPrefix": "String"
}
```

