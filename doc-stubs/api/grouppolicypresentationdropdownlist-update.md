---
title: "Update groupPolicyPresentationDropdownList"
description: "Update the properties of a groupPolicyPresentationDropdownList object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update groupPolicyPresentationDropdownList
Namespace: microsoft.graph



Update the properties of a [groupPolicyPresentationDropdownList](../resources/grouppolicypresentationdropdownlist.md) object.

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
PATCH ** Entity URI for microsoft.graph.groupPolicyPresentationDropdownList not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [groupPolicyPresentationDropdownList](../resources/grouppolicypresentationdropdownlist.md) object.

The following table shows the properties that are required when you update the [groupPolicyPresentationDropdownList](../resources/grouppolicypresentationdropdownlist.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|label|String|Localized text label for any presentation entity. The default value is empty. Inherited from [groupPolicyPresentation](../resources/grouppolicypresentation.md)|
|lastModifiedDateTime|DateTimeOffset|The date and time the entity was last modified. Inherited from [groupPolicyPresentation](../resources/grouppolicypresentation.md)|
|defaultItem|[groupPolicyPresentationDropdownListItem](../resources/grouppolicypresentationdropdownlistitem.md)|Localized string value identifying the default choice of the list of items.|
|items|[groupPolicyPresentationDropdownListItem](../resources/grouppolicypresentationdropdownlistitem.md) collection|Represents a set of localized display names and their associated values.|
|required|Boolean|Requirement to enter a value in the parameter box. The default value is false.|



## Response

If successful, this method returns a `200 OK` response code and an updated [groupPolicyPresentationDropdownList](../resources/grouppolicypresentationdropdownlist.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_grouppolicypresentationdropdownlist"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0** Entity URI for microsoft.graph.groupPolicyPresentationDropdownList not found
Content-Type: application/json
Content-length: 343

{
  "@odata.type": "#microsoft.graph.groupPolicyPresentationDropdownList",
  "label": "String",
  "defaultItem": {
    "@odata.type": "microsoft.graph.groupPolicyPresentationDropdownListItem"
  },
  "items": [
    {
      "@odata.type": "microsoft.graph.groupPolicyPresentationDropdownListItem"
    }
  ],
  "required": "Boolean"
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
  "@odata.type": "#microsoft.graph.groupPolicyPresentationDropdownList",
  "id": "ddcfb81c-b81c-ddcf-1cb8-cfdd1cb8cfdd",
  "label": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "defaultItem": {
    "@odata.type": "microsoft.graph.groupPolicyPresentationDropdownListItem"
  },
  "items": [
    {
      "@odata.type": "microsoft.graph.groupPolicyPresentationDropdownListItem"
    }
  ],
  "required": "Boolean"
}
```

