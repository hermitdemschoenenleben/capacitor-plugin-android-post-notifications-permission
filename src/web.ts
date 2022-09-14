import { WebPlugin } from '@capacitor/core';

import type { AndroidPostNotificationsPermissionPlugin } from './definitions';

export class AndroidPostNotificationsPermissionWeb extends WebPlugin implements AndroidPostNotificationsPermissionPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
