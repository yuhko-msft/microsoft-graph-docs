---
title: "Create groupPolicyPresentationTextBox"
description: "Create a new groupPolicyPresentationTextBox object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create groupPolicyPresentationTextBox
Namespace: microsoft.graph



Create a new [groupPolicyPresentationTextBox](../resources/grouppolicypresentationtextbox.md) object.

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
POST ** Collection URI for microsoft.graph.groupPolicyPresentationTextBox not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [groupPolicyPresentationTextBox](../resources/grouppolicypresentationtextbox.md) object.

The following table shows the properties that are required when you create the [groupPolicyPresentationTextBox](../resources/grouppolicypresentationtextbox.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|label|String|Localized text label for any presentation entity. The default value is empty. Inherited from [groupPolicyPresentation](../resources/grouppolicypresentation.md)|
|lastModifiedDateTime|DateTimeOffset|The date and time the entity was last modified. Inherited from [groupPolicyPresentation](../resources/grouppolicypresentation.md)|
|defaultValue|String|Localized default string displayed in the text box. The default value is empty.|
|maxLength|Int64|An unsigned integer that specifies the maximum number of text characters. Default value is 1023.|
|required|Boolean|Requirement to enter a value in the text box. Default value is false.|



## Response

If successful, this method returns a `201 Created` response code and a [groupPolicyPresentationTextBox](../resources/grouppolicypresentationtextbox.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_grouppolicypresentationtextbox_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.groupPolicyPresentationTextBox not found
Content-Type: application/json
Content-length: 176

{
  "@odata.type": "#microsoft.graph.groupPolicyPresentationTextBox",
  "label": "String",
  "defaultValue": "String",
  "maxLength": "Integer",
  "required": "Boolean"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.groupPolicyPresentationTextBox"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.groupPolicyPresentationTextBox",
  "id": "e6d05296-5296-e6d0-9652-d0e69652d0e6",
  "label": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "defaultValue": "String",
  "maxLength": "Integer",
  "required": "Boolean"
}
```

