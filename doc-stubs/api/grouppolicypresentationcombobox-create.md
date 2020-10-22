---
title: "Create groupPolicyPresentationComboBox"
description: "Create a new groupPolicyPresentationComboBox object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create groupPolicyPresentationComboBox
Namespace: microsoft.graph

Create a new [groupPolicyPresentationComboBox](../resources/grouppolicypresentationcombobox.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
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
POST ** Collection URI for microsoft.graph.groupPolicyPresentationComboBox not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [groupPolicyPresentationComboBox](../resources/grouppolicypresentationcombobox.md) object.

The following table shows the properties that are required when you create the [groupPolicyPresentationComboBox](../resources/grouppolicypresentationcombobox.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|label|String|**TODO: Add Description** Inherited from [groupPolicyPresentation](../resources/intune-grouppolicypresentation.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [groupPolicyPresentation](../resources/intune-grouppolicypresentation.md)|
|defaultValue|String|**TODO: Add Description**|
|suggestions|String collection|**TODO: Add Description**|
|required|Boolean|**TODO: Add Description**|
|maxLength|Int64|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [groupPolicyPresentationComboBox](../resources/grouppolicypresentationcombobox.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_grouppolicypresentationcombobox_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.graph.groupPolicyPresentationComboBox not found
Content-Type: application/json
Content-length: 217

{
  "@odata.type": "#microsoft.graph.groupPolicyPresentationComboBox",
  "label": "String",
  "defaultValue": "String",
  "suggestions": [
    "String"
  ],
  "required": "Boolean",
  "maxLength": "Integer"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.groupPolicyPresentationComboBox"
}
-->
``` http
HTTP/1.1 201 Created

Content-Type: application/json
{
  "@odata.type": "#microsoft.graph.groupPolicyPresentationComboBox",
  "id": "44e86877-6877-44e8-7768-e8447768e844",
  "label": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "defaultValue": "String",
  "suggestions": [
    "String"
  ],
  "required": "Boolean",
  "maxLength": "Integer"
}
```

