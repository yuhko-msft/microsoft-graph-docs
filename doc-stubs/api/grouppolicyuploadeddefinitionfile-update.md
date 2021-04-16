---
title: "Update groupPolicyUploadedDefinitionFile"
description: "Update the properties of a groupPolicyUploadedDefinitionFile object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update groupPolicyUploadedDefinitionFile
Namespace: microsoft.graph



Update the properties of a [groupPolicyUploadedDefinitionFile](../resources/grouppolicyuploadeddefinitionfile.md) object.

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
PATCH /deviceManagement/groupPolicyUploadedDefinitionFiles/{groupPolicyUploadedDefinitionFileId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [groupPolicyUploadedDefinitionFile](../resources/grouppolicyuploadeddefinitionfile.md) object.

The following table shows the properties that are required when you update the [groupPolicyUploadedDefinitionFile](../resources/grouppolicyuploadeddefinitionfile.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|description|String|The localized description of the policy settings in the ADMX file. The default value is empty. Inherited from [groupPolicyDefinitionFile](../resources/grouppolicydefinitionfile.md)|
|displayName|String|The localized friendly name of the ADMX file. Inherited from [groupPolicyDefinitionFile](../resources/grouppolicydefinitionfile.md)|
|languageCodes|String collection|The supported language codes for the ADMX file. Inherited from [groupPolicyDefinitionFile](../resources/grouppolicydefinitionfile.md)|
|lastModifiedDateTime|DateTimeOffset|The date and time the entity was last modified. Inherited from [groupPolicyDefinitionFile](../resources/grouppolicydefinitionfile.md)|
|policyType|groupPolicyType|Specifies the type of group policy. Inherited from [groupPolicyDefinitionFile](../resources/grouppolicydefinitionfile.md). Possible values are: `admxBacked`, `admxIngested`.|
|revision|String|The revision version associated with the file. Inherited from [groupPolicyDefinitionFile](../resources/grouppolicydefinitionfile.md)|
|targetNamespace|String|Specifies the URI used to identify the namespace within the ADMX file. Inherited from [groupPolicyDefinitionFile](../resources/grouppolicydefinitionfile.md)|
|targetPrefix|String|Specifies the logical name that refers to the namespace within the ADMX file. Inherited from [groupPolicyDefinitionFile](../resources/grouppolicydefinitionfile.md)|
|content|Binary|The contents of the uploaded ADMX file.|
|defaultLanguageCode|String|The default language of the uploaded ADMX file.|
|fileName|String|The file name of the uploaded ADML file.|
|groupPolicyUploadedLanguageFiles|[groupPolicyUploadedLanguageFile](../resources/grouppolicyuploadedlanguagefile.md) collection|The list of ADML files associated with the uploaded ADMX file.|
|status|groupPolicyUploadedDefinitionFileStatus|The upload status of the uploaded ADMX file. Possible values are: `none`, `uploadInProgress`, `available`, `assigned`, `removalInProgress`, `uploadFailed`, `removalFailed`.|
|uploadDateTime|DateTimeOffset|The uploaded time of the uploaded ADMX file.|



## Response

If successful, this method returns a `200 OK` response code and an updated [groupPolicyUploadedDefinitionFile](../resources/grouppolicyuploadeddefinitionfile.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_grouppolicyuploadeddefinitionfile"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/groupPolicyUploadedDefinitionFiles/{groupPolicyUploadedDefinitionFileId}
Content-Type: application/json
Content-length: 570

{
  "@odata.type": "#microsoft.graph.groupPolicyUploadedDefinitionFile",
  "description": "String",
  "displayName": "String",
  "languageCodes": [
    "String"
  ],
  "policyType": "String",
  "revision": "String",
  "targetNamespace": "String",
  "targetPrefix": "String",
  "content": "Binary",
  "defaultLanguageCode": "String",
  "fileName": "String",
  "groupPolicyUploadedLanguageFiles": [
    {
      "@odata.type": "microsoft.graph.groupPolicyUploadedLanguageFile"
    }
  ],
  "status": "String",
  "uploadDateTime": "String (timestamp)"
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
  "@odata.type": "#microsoft.graph.groupPolicyUploadedDefinitionFile",
  "id": "9e2c7f69-7f69-9e2c-697f-2c9e697f2c9e",
  "description": "String",
  "displayName": "String",
  "languageCodes": [
    "String"
  ],
  "lastModifiedDateTime": "String (timestamp)",
  "policyType": "String",
  "revision": "String",
  "targetNamespace": "String",
  "targetPrefix": "String",
  "content": "Binary",
  "defaultLanguageCode": "String",
  "fileName": "String",
  "groupPolicyUploadedLanguageFiles": [
    {
      "@odata.type": "microsoft.graph.groupPolicyUploadedLanguageFile"
    }
  ],
  "status": "String",
  "uploadDateTime": "String (timestamp)"
}
```

