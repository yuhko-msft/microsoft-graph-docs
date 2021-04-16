---
title: "Update groupPolicyPresentationCheckBox"
description: "Update the properties of a groupPolicyPresentationCheckBox object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update groupPolicyPresentationCheckBox
Namespace: microsoft.graph



Update the properties of a [groupPolicyPresentationCheckBox](../resources/grouppolicypresentationcheckbox.md) object.

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
PATCH ** Entity URI for microsoft.graph.groupPolicyPresentationCheckBox not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [groupPolicyPresentationCheckBox](../resources/grouppolicypresentationcheckbox.md) object.

The following table shows the properties that are required when you update the [groupPolicyPresentationCheckBox](../resources/grouppolicypresentationcheckbox.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|label|String|Localized text label for any presentation entity. The default value is empty. Inherited from [groupPolicyPresentation](../resources/grouppolicypresentation.md)|
|lastModifiedDateTime|DateTimeOffset|The date and time the entity was last modified. Inherited from [groupPolicyPresentation](../resources/grouppolicypresentation.md)|
|defaultChecked|Boolean|Default value for the check box. The default value is false.|



## Response

If successful, this method returns a `200 OK` response code and an updated [groupPolicyPresentationCheckBox](../resources/grouppolicypresentationcheckbox.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_grouppolicypresentationcheckbox"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0** Entity URI for microsoft.graph.groupPolicyPresentationCheckBox not found
Content-Type: application/json
Content-length: 127

{
  "@odata.type": "#microsoft.graph.groupPolicyPresentationCheckBox",
  "label": "String",
  "defaultChecked": "Boolean"
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
  "@odata.type": "#microsoft.graph.groupPolicyPresentationCheckBox",
  "id": "b7e51cad-1cad-b7e5-ad1c-e5b7ad1ce5b7",
  "label": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "defaultChecked": "Boolean"
}
```

