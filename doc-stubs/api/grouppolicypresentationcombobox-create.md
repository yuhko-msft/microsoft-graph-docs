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
|label|String|Localized text label for any presentation entity. The default value is empty. Inherited from [groupPolicyPresentation](../resources/grouppolicypresentation.md)|
|lastModifiedDateTime|DateTimeOffset|The date and time the entity was last modified. Inherited from [groupPolicyPresentation](../resources/grouppolicypresentation.md)|
|defaultValue|String|Localized default string displayed in the combo box. The default value is empty.|
|maxLength|Int64|An unsigned integer that specifies the maximum number of text characters for the parameter. The default value is 1023.|
|required|Boolean|Specifies whether a value must be specified for the parameter. The default value is false.|
|suggestions|String collection|Localized strings listed in the drop-down list of the combo box. The default value is empty.|



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
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.groupPolicyPresentationComboBox not found
Content-Type: application/json
Content-length: 217

{
  "@odata.type": "#microsoft.graph.groupPolicyPresentationComboBox",
  "label": "String",
  "defaultValue": "String",
  "maxLength": "Integer",
  "required": "Boolean",
  "suggestions": [
    "String"
  ]
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
  "id": "bf50bf26-bf26-bf50-26bf-50bf26bf50bf",
  "label": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "defaultValue": "String",
  "maxLength": "Integer",
  "required": "Boolean",
  "suggestions": [
    "String"
  ]
}
```

