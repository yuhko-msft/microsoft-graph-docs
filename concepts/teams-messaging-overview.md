# Working with Microsoft Teams messaging

Microsoft Teams has a comprehensive set of APIs for performing messaging operations on Microsoft Teams using Microsoft Graph. This document lists the various schema elements used by these APIs and makes suggestions on the APIs to use based on the scenario being targetted by the caller. The list of scenarios is in no way comprehensive but should guide the callers which API to invoke based on high level scenarios.

## Understanding chatMessage schema

[chatMessage](/graph/api/resources/chatMessage?preserve-view=true) represents messages in Microsoft Teams [chats](/graph/api/resources/chat?preserve-view=true) and [channels](/graph/api/resources/channel?preserve-view=true). In this section we will be describing various elements of the schema itself.

### attachments

[Attachments](/graph/api/resources/chatmessageattachment?preserve-view=true) represents entities which can be referenced from a [chatMessage](/graph/api/resources/chatMessage?preserve-view=true). This includes objects like files, tabs, cards, meetings or other messages. The items themselves might be located somewhere else. For example, files might be stored in SharePoint. Section below describes various possibilities

#### file

When an [attachment](/graph/api/resources/chatmessageattachment?preserve-view=true) object refers to a file, it has information about the file including the link to open the file. The file itself is located in an accessible store like SharePoint. When refering to a file attachment, `contentType` is set to `reference`. Additionally, the file url is located in `contentUrl`.

> **Note:** The SharePoint url is link used to render the file, it is not the Microsoft Graph url. Callers can however use [Access shared items](/graph/api/shares-get?preserve-view=true) API to get the info and content of the file.

#### tab

[Attachment](/graph/api/resources/chatmessageattachment?preserve-view=true) object refers to a [tab](/graph/api/resources/teamstab?preserve-view=true) hosted in the present context. This is often used to refer to newly added tab. When referring to a [tab](/graph/api/resources/teamstab?preserve-view=true), `contentType` is set to `tabReference`, and `id` is set to the Id of the tab. Additionally, name is set to the provided name of the [tab](/graph/api/resources/teamstab?preserve-view=true).

#### card

Cards represent visual elements backed by a pre-defined schema. Microsoft Teams supports various cards [as defined by Bot Framework](/azure/bot-service/rest-api/bot-framework-rest-connector-api-reference?view=azure-bot-service-4.0#attachment-object). Additionally, Microsoft Teams supports 2 additional cards

- Code snippet - With `contentType` set to `application/vnd.microsoft.card.codesnippet`
- Annoucement card - With `contentType` set to `application/vnd.microsoft.card.announcement`

For cards `contentType` is set to the type of card, while `content` itself represents the serialized json for the card.

> **Note:** Additionaly aspects of cards like images might refer to external resources of resources hosted by Microsoft Teams as [chatMessageHostedContent](/graph/api/resources/chatmessagehostedcontent?preserve-view=true).

#### meeting

When a meeting is scheduled in a channel, a message with meeting details is posted in the channel. A meeting attachment represents this object along with details of the meeting. `id` represents Id of the meeting, while `content` has details regarding organizer of the meeting and Exchange Id of the meeting. This Id can be used to look the meeting up using calendar APIs. `contentType` is set to `meetingReference` for meeting attachments.

#### message

Attachment object refers to a message when a specific message is being replied to in a [chat](/graph/api/resources/chat?preserve-view=true). For message attachments, `id` represents Id of the message. `content` contains additional details for example preview text of the message and sender of the message being replied to. `contentType` is set to `messageReference` for such attachments.

### body

`body` represents the body of the message. `body` in itself can refer to other elements in the schema like mentions, attachments. Body can be `text` or `html` as represented by the `contentType` property.

Microsoft Teams supports additional schema elements which are outside of the HTML specifications to support additional elements like mentions. Following elements are supported by `chatMessage` schema which are not HTML elements

- at - Reference to an [chatMessageMention](/graph/api/resources/chatmessagemention?preserve-view=true) representing details of a user, application, [channel](/graph/api/resources/channel?preserve-view=true), [team](/graph/api/resources/team?preserve-view=true) or [tag](/graph/api/resources/teamworktag?preserve-view=true) being @mentioned
- attachment - Representing the position of an attachment reference
- systemEventMessage - When body `content` is set to `<systemEventMessage/>`, it means the message represents a special event. You can read more about system events [here](/graph/system-messages).

### channelIdentity

If [chatMessage](/graph/api/resources/chatmessage?preserve-view=true) was sent in a [channel](/graph/api/resources/channel?preserve-view=true), `channelIdentity` represents the details about the channel. This includes Id of the [channel](/graph/api/resources/channel?preserve-view=true) and Id of the [team](/graph/api/resources/team?preserve-view=true). This property is read-only.

### chatId

If [chatMessage](/graph/api/resources/chatmessage?preserve-view=true) was sent in a [chat](/graph/api/resources/chat?preserve-view=true), `chatId` represents the Id of the chat in which message was sent. This property is read-only.

### createdDateTime

`createdDateTime` represents the time when the message was created on the server. This timestamp might be different than when the message was sent by the caller. Server records only server side timestamp. This property is usually read-only, however it can be written when [importing messages from an external system](/microsoftteams/platform/graph-api/import-messages/import-external-messages-to-teams).

### deletedDateTime

If [chatMessage](/graph/api/resources/chatmessage?preserve-view=true) was deleted, `deletedDateTime` represents the time of deletion for the message. This property is read-only.

> **Note:** Deleted messages are not always returned by all the APIs. [Change notifications](/graph/teams-changenotifications-chatmessage) always return deleted message notifications if subscription include deleted change type.

### etag

`etag` represents the version of the message. Any changes to message (including reactions, edits etc) change the `etag` of the message. This property is read-only.

### eventDetail

If present, represents details of an event that happened in a [chat](/graph/api/resources/chat?preserve-view=true), a [channel](/graph/api/resources/channel?preserve-view=true), or a [team](/graph/api/resources/team?preserve-view=true), for example, adding new members. For event messages, the messageType property will be set to `systemEventMessage`. You can read more about system events [here](/graph/system-messages).

### from

Represents the sender of the message. Microsoft Teams supports a large set of senders

- Azure AD users - Users who have a valid Azure AD user. This includes [Azure AD guests](/azure/active-directory/external-identities/what-is-b2b) and [native federation](/microsoftteams/manage-external-access)
- Anonymous guests - Users who join a meeting using join link. These users provide a display name when joining meeting. They have no persistent identity in Microsoft 365.
- Personal Microsoft account users - Users using their personal Microsoft account to login into Microsoft Teams
- Skype users - Skype (for consumer) users. You can learn more about this interop [here](/microsoftteams/teams-skype-interop)
- Skype for business users - Users using Skype For Business. You learn more about this [here](/microsoftteams/teams-and-skypeforbusiness-coexistence-and-interoperability)
- Bots - Bots using [Microsoft Bot Framework](/azure/bot-service/?view=azure-bot-service-4.0) to write conversational bots
- Outgoing webhooks - Outgoing webhooks allow developers to build a low cost solution which is in some respects similar to bots. You can read more about outgoing webhooks [here](/microsoftteams/platform/webhooks-and-connectors/how-to/add-outgoing-webhook)
- Office 365 connectors - Office 365 connectors allow posting one way messages to Microsoft Teams. You can learn more about this integration [here](/microsoftteams/platform/webhooks-and-connectors/how-to/connectors-creating)

This property is usually read-only, however it can be written when [importing messages from an external system](/microsoftteams/platform/graph-api/import-messages/import-external-messages-to-teams).

### id

Unique Id representing the message. This property is read-only.

> **Note:** Id is unique only under a specific scope i.e. chat or a channel. Different messages across chats and channels might have same Id.

### importance

Represents importance of the message. Possible values are

- normal
- high
- urgent

### lastEditedDateTime

Represents the timestamp when the message was edited by the user. This is represented in Microsoft Teams UI with `Edited` flag.

### lastModifiedDateTime

Represents the timestamp when the message was last modified. This includes changes like reactions. `eTag` and `lastModifiedDateTime` both change together.

### mentions

Represents users, applications (bots, webhooks etc), channels, teams or tags being @mentioned.

### messageType

Represents the type of message. The values in use are 

- message - Representing messages sent by users, applications etc
- systemEventMessage - Represents messages sent by Microsoft Teams with details about various events like adding members, deleting channels etc. You can read more about system events [here](/graph/system-messages).

Additional values not used right now

- typing
- chatEvent

### onBehalfOf

User attribution of the message when bot sends a message on behalf of a user. You can read more about user attribution [here](/microsoftteams/platform/messaging-extensions/how-to/action-commands/respond-to-task-module-submit?tabs=dotnet%2Cdotnet-1#user-attribution-for-bots-messages).

### policyViolation

If the message violated any data loss prevention (DLP) policies set by the tenant, a message PATCH can be invoked with the details of the policy being violated. This hides the message from the Microsoft Teams UI. This element represents the details of the policy being violated, along with the action.

### reactions

Represents reactions from other users on this message. This includes reactions like likes etc. Each elements represents information about the reaction and the user who reacted.

### replyToId

Represents the Id of the message this message is a reply to in a reply chain. This property is only set for channel messages. This property is read-only.

> **Note:** For replying to messages in a chat, message reference is used. Additionally, chats allowing multiple of message reference elements.

### subject

Subject of the message. This is valid only for messages sent in channel.

### webUrl

Url pointing to the message in Microsoft Teams UI. This url can be used to open the message directly in Microsoft Teams UI in a browser.


